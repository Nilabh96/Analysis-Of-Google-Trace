								Analysis Of Google cloud trace 

Working Steps For Program1:

1. First we need to merge all the csv files of task_event folder of google cloud trace to a single file using the following command given below in command prompt :

   :copy *.csv newfile.csv

 
2. Then we need to Find the timestamp and job_id of a specific day for a specific range of hour.
  
   The output file is saved in a csv file. 



Working Steps For Program2:

1. We need to merge all csv file of task_usage folder using the above command accordingly. 


2. Where we will compare the job_id from the first output file with the job_id of task-usage csv file.


3. After getting the matched job_id of both the files, we get the arrival time, execution time, deadline and CPU usage of the respective job_id's.


4. The Output is saved in a csv file.


											
														Thank You