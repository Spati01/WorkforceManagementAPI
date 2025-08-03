 Mission: The Challenge Tasks 🎯
Your mission is divided into three parts. You'll start with setting up the project, then move on to fixing bugs and implementing new features.
Part 0: Project Setup & Structuring
Your first goal is to get the provided code running in a professional project structure. We have provided you with a single Java file that contains all the application's code in the Codebase tab
Create a Project: Set up a new, fully functional Spring Boot project using Gradle.
Structure the Code: Take the classes from the single file and organize them into a standard project layout. A good structure is essential for maintainable code. Here’s an example of what that might look like:
src/main/java/com/yourcompany/workforcemgmt/
├── WorkforcemgmtApplication.java
├── controller/
│   └── TaskController.java
├── service/
│   └── TaskService.java
├── model/
│   └── Task.java
│   └── Staff.java
└── dto/
    └── TaskDto.java
    └── CreateTaskRequest.java


Configure Dependencies: Create your build.gradle file and add the necessary dependencies to make the project work. Key dependencies include:
Spring Web: For building the API endpoints.
Lombok: A great tool to reduce boilerplate code (like getters, setters, and constructors).
MapStruct: A library that simplifies mapping between data objects (e.g., converting a Task model to a TaskDto).

Part 1: Bug Fixes 🐞

Once your project is running, it's time to fix two issues reported by our users.
Bug 1: Task Re-assignment Creates Duplicates
User Report: "As a manager, when I reassign a customer's work to a new salesperson using the 'assign-by-ref' feature, the old task isn't being removed. This creates a duplicate task and causes confusion."
Your Goal: Fix the logic so that when a task is reassigned, the old task for the previous employee is marked as CANCELLED.
Bug 2: Cancelled Tasks Clutter the View
User Report: "As an operations employee, when I fetch my tasks for a specific date range, the list is cluttered with cancelled tasks that I don't need to see."
Your Goal: Modify the task-fetching endpoint so that it only returns tasks that are not CANCELLED.

Part 2: New Features ✨

Now, let's build some highly requested features to improve the application.
Feature 1: A "Smart" Daily Task View
User Need: "As an operations employee, just seeing tasks created today isn't enough. I need a true 'today's work' view that shows everything I need to act on."
Your Goal: Enhance the date-based task fetching logic. When a user queries for a date range, the API should return:
All active tasks that started within that range.
PLUS all active tasks that started before the range but are still open and not yet completed.
Feature 2: Implement Task Priority
User Need: "As a manager, I need to set and change task priorities so my team knows what to focus on."
Your Goal:
Add a priority field to the Task model (e.g., HIGH, MEDIUM, LOW).
Create a new endpoint that allows a manager to change a task's priority after it has been created.
Create a new endpoint to fetch all tasks of a specific priority (e.g., /tasks/priority/HIGH).
Feature 3: Implement Task Comments & Activity History
User Need: "As a team lead, I need to see a full history of a task and add comments so everyone is on the same page."
Your Goal:
Activity History: Automatically log key events for each task. For example: "User A created this task," "User B changed the priority to HIGH."
User Comments: Allow users to add free-text comments to a task.
Viewing: When a user fetches the details for a single task, the API response must include its complete activity history and all user comments, sorted chronologically.

Technical Environment 🛠️

Language: Java 17
Framework: Spring Boot 3.0.4
Build Tool: Gradle
Database: None required! Please use in-memory Java collections (Map, List, etc.) inside a service class to store your data.
