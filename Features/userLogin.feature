Feature: User login

Scenario Outline: User login into amazon account

Given i am rhe amazon home page

When i click on sign in button in the homepage

And i enter the "<email_address>" in the email input bar
And i click the continue button
And i enter the "<password>" in the password input bar
And i click on the sign button


Then i can login into my account successfully

Examples: 
|email_address    | password |
|abc@gmail.com    | 123213   |
|def@gmail.com    | 72362356 |