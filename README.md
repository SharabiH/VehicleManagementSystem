# VehicleManagementSystem

פרויקט Java המדגים ניהול רכבים באמצעות תכנות מונחה עצמים (OOP).  
הפרויקט משתמש במושגים של **Inheritance**, **Method Overriding**, **Super Constructors**, ו-**Polymorphism** כדי לנהל סוגי רכבים שונים: רכבים פרטיים, אופנועים ומשאיות.

---

## תיאור הפרויקט

הפרויקט בונה מערכת ניהול רכבים שמאפשרת:
- יצירת רכבים מסוגים שונים  
- הצגת מידע על כל רכב  
- חישוב עלויות ביטוח מותאמות לכל סוג רכב  
- הדגמת שימוש ב-OOP ומערכים של אובייקטים מסוג Vehicle (Polymorphism)  

---

## קבצים בפרויקט

| קובץ | תיאור |
|-------|-------|
| **Vehicle.java** | מחלקת בסיס לרכבים עם שדות כלליים (`brand`, `model`, `year`, `price`) ופונקציות כמו `displayInfo()`, `calculateInsurance()`, ו-`startEngine()`. |
| **Car.java** | מחלקת תת-סוג ל-Vehicle לרכבים פרטיים. מוסיפה את השדות `numberOfDoors` ו-`fuelType`, ופונקציה `honk()`. עושה Override לפונקציות `displayInfo()`, `calculateInsurance()` ו-`getVehicleType()`. |
| **Motorcycle.java** | מחלקת תת-סוג לאופנועים עם שדות `engineCC` ו-`hasSidecar`, ופונקציה `revEngine()`. עושה Override לפונקציות `displayInfo()`, `calculateInsurance()` ו-`getVehicleType()`. |
| **Truck.java** | מחלקת תת-סוג למשאיות עם שדות `cargoCapacity` ו-`numberOfAxles`, ופונקציה `loadCargo()`. עושה Override לפונקציות `displayInfo()`, `calculateInsurance()` ו-`getVehicleType()`. |
| **VehicleDemo.java** | קלאס ראשי להרצת הפרויקט. יוצר אובייקטים מסוג Vehicle, Car, Motorcycle, ו-Truck, מציג מידע, מחושב ביטוח, ומדגים Polymorphism. |

---

## איך להריץ את הפרויקט

בטרמינל או ב-IDE (בתיקיית הפרויקט):

javac Vehicle.java Car.java Motorcycle.java Truck.java VehicleDemo.java
java VehicleDemo

הפרויקט יציג את פרטי הרכבים, חישוב ביטוח מותאם לכל סוג רכב, ופעולות ייחודיות כמו honk(), revEngine(), ו-loadCargo().


## מה הפרויקט מדגים?
1. Inheritance – מחלקות משנה שמורשות מ-Vehicle
2. Super Constructors – שימוש ב-super() בקונסטרקטורים כדי לאתחל שדות של המחלקה הבסיסית
3. Method Overriding – שינוי פונקציות מהמחלקה הבסיסית לפי סוג הרכב
4. Polymorphism – שימוש במערך של Vehicle שמכיל סוגי רכבים שונים וקריאה לפונקציות בהתאם לאובייקט בפועל


## דוגמא לפלט:
Vehicle constructor called

=== Vehicle Information ===

Brand: Generic

Model: Model X

Year: 2020

Price: $15000.0

Insurance: $750.0


Car constructor called

=== Vehicle Information ===

Brand: Toyota

Model: Camry

Year: 2023

Price: $28000.0

Number of doors: 4

FuelType: Gasoline

Vehicle Type: Car

Insurance: $1540.0

Beep Beep!


Motorcycle constructor called

=== Vehicle Information ===

Brand: Harley

Model: Iron 883

Year: 2022

Price: $12000.0

Engine CC: 883

Has Sidecar: false

Vehicle Type: Motorcycle

Insurance: $480.0

VROOOOOM!


Truck constructor called

=== Vehicle Information ===

Brand: Ford

Model: F-150

Year: 2023

Price: $45000.0

Cargo Capacity: 2.5 tons

Number of Axles: 2

Vehicle Type: Truck

Insurance: $2812.5

Cargo loaded successfully: 2.0 tons

Error: Cargo exceeds capacity!
