import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class TaskAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numWorkers = scanner.nextInt(); // Number of workers
        int numTasks = scanner.nextInt();   // Number of tasks
        
        scanner.nextLine();  // Consume newline character
        
        // Initialize queues for workers and tasks
        Queue<String> workersQueue = new LinkedBlockingDeque<>();
        Queue<String> tasksQueue = new LinkedBlockingDeque<>();
        
        // Populate worker and task queues
        for (int i = 1; i <= numWorkers; i++) {
            workersQueue.add("W" + i);
        }
        for (int i = 1; i <= numTasks; i++) {
            tasksQueue.add("T" + i);
        }
        
        // Initialize a list to store task completion times
        List<String> taskCompletionTimes = new ArrayList<>();
        
        // Read task information and allocate tasks to workers
        while (!tasksQueue.isEmpty()) {
            String taskInfo = scanner.nextLine();
            String[] taskParts = taskInfo.split(" ");
            String taskName = taskParts[0];
            String taskType = taskParts[1];
            int completionTime = Integer.parseInt(taskParts[2]);
            
            if (taskType.equals("Machine")) {
                // Machine-bound task, completed in 0 minutes
                taskCompletionTimes.add(workersQueue.poll() + " " + taskName + " 0");
            } else {
                // Manual task, allocate to the next available worker
                String worker = workersQueue.poll();
                taskCompletionTimes.add(worker + " " + taskName + " " + completionTime);
                workersQueue.add(worker);
            }
        }
        
        // Sort the task completion times by completion time and task name
        taskCompletionTimes.sort(new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                int time1 = Integer.parseInt(t1.split(" ")[2]);
                int time2 = Integer.parseInt(t2.split(" ")[2]);
                if (time1 != time2) {
                    return Integer.compare(time1, time2);
                } else {
                    return t1.split(" ")[1].compareTo(t2.split(" ")[1]);
                }
            }
        });
        
        // Output the sorted task completion times
        for (String completionTime : taskCompletionTimes) {
            System.out.println(completionTime);
        }
    }
}
