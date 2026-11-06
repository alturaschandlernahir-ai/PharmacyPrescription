# Pharmacy Prescription Processing System
**IT20: Data Structures and Algorithms Midterm Project**

## Client Scenario
A pharmacy desktop tool to manage prescription queue processing based on urgency level using a manually implemented Priority Queue.

## Features
- **Register Prescription:** Add prescription details with an assigned urgency level (Low, Medium, Emergency).
- **Active Queue View:** Automatically displays highest-urgency prescriptions at the top.
- **Process Prescription:** Dequeues the highest-urgency prescription.
- **Search:** Manual linear search by Prescription ID.

## Data Structure & Algorithm
- **Data Structure:** Custom Array-based Priority Queue (Built from scratch without `java.util` collections).
- **Searching Algorithm:** Manual Linear Search inspecting stored `Prescription` objects directly.

## Team Roles & Contributions
- **ALTURAS (Backend & DSA Lead):** Implementation of `Prescription` model, `PriorityQueue` array logic, and linear search.
- **COMPENDIO (GUI & Integration Lead):** Java Swing `JFrame` drag-and-drop form design, input validation, and `JTable` rendering.
