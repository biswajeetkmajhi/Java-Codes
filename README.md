# Java Lab — Workspace Overview

This repository contains the Java lab exercises organized by day and topic for the course.

Structure
- `DAY 1/` … `DAY 8/`: Daily exercise folders (each contains `p1.java`, `p2.java`, etc.)
- `gui/`: GUI examples (Calculator, Converter, ListExample, etc.)
- `mt/`: Multithreading/examples folder
- `test on 17.3.25/`: Misc test files

Quick start
1. Open a terminal in the repository root (this folder).
2. Compile all Java sources:

```bash
javac **/*.java
```

Notes: on Windows PowerShell you can run:

```powershell
Get-ChildItem -Recurse -Filter "*.java" | ForEach-Object { javac $_.FullName }
```

Run a program
- Change into the folder containing the class with `main` and run:

```bash
javac MyClass.java
java MyClass
```

Tips
- If files declare a `package`, compile from the repository root and run with the package-qualified class name.
- Use an IDE (IntelliJ IDEA, Eclipse, VS Code with Java extensions) for easier navigation and build/run.
- Keep folder names unchanged to preserve the course organization.

Contact
- Maintainer: Classroom exercises
- Created: 2026-05-18
