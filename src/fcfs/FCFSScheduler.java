package fcfs;

	import java.util.*;

	class Process {
	    int pid; // Process ID
	    int arrivalTime; // Arrival time of the process
	    int burstTime; // Burst time of the process

	    public Process(int pid, int arrivalTime, int burstTime) {
	        this.pid = pid;
	        this.arrivalTime = arrivalTime;
	        this.burstTime = burstTime;
	    }
	}

	public class FCFSScheduler {
	    public static void main(String[] args) {
	        List<Process> processes = new ArrayList<>();

	        // Add processes to the list
	        processes.add(new Process(1, 0, 6)); // Process ID, Arrival Time, Burst Time
	        processes.add(new Process(2, 2, 4));
	        processes.add(new Process(3, 4, 7));
	        processes.add(new Process(4, 6, 3));

	        // Sort processes based on arrival time (for FCFS)
	        Collections.sort(processes, Comparator.comparingInt(p -> p.arrivalTime));

	        // Run processes in FCFS order
	        int currentTime = 0;
	        for (Process process : processes) {
	            if (currentTime < process.arrivalTime) {
	                currentTime = process.arrivalTime;
	            }
	            System.out.println("Process " + process.pid + " started at time " + currentTime);
	            currentTime += process.burstTime;
	            System.out.println("Process " + process.pid + " finished at time " + currentTime);
	        }
	    }
	}

