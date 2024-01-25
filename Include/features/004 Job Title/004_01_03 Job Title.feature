Feature: Job Title
Scenario Outline: Upload 1MB file

Given User guided to login
When User navigated to title
And User upload 1MB file <gambar>
Then User save the changes made on profile

Examples: 

|gambar|
|C:\Users\User\Downloads\file-example_PDF_1MB.pdf|