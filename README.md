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


## Testing Procedures
- Run `PharmacyPrescriptionFrame` via NetBeans using `F6`.
- Enqueue prescriptions with varying urgency levels (1 to 3) to test priority ordering.
- Test manual linear search by inputting unique Prescription IDs.

## Submission Notes
- Built using Java Swing GUI and custom array-based Priority Queue.
- Verified against all project requirements with 20 team commits.
