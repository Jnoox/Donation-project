# 🩺 Life in Donation

A simple console-based Java application that connects **donors** of medical devices with **people in need** of them. Donors can offer devices they no longer use, and people in need can browse what's available or post a specific request.

---

## ✨ Features

### For Donors
- **View the list of needs** — see what people are currently requesting.
- **Donate a device** — record a device (name, status, type, usage time, and description) to make it available to others.

### For Those in Need
- **Browse available devices** — see all donated devices currently on offer.
- **Post a specific need** — submit a request with your National ID, the device name, a description, a delivery address, and a contact number.

---

## 🗂️ Project Structure

| File | Responsibility |
|------|----------------|
| `DonationProject.java` | Main entry point. Displays the menu and routes the user between donor and recipient flows. |
| `device.java` | Model for a donated device. Builds the device detail string and writes it to storage. |
| `list_of_devices.java` | Reads and prints all available donated devices. |
| `Specific_Need.java` | Model for a recipient's request. Builds the request detail and writes it to storage. |
| `List_of_needs.java` | Reads and prints all posted needs. |

### Data Storage
The app uses plain text files for persistence (created automatically on first use):
- `arwa.txt` — stores donated devices.
- `specificNeeds.txt` — stores posted needs.

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8 or higher** installed.

### Compile
From the project directory:
```bash
javac *.java
```

### Run
```bash
java donationproject.DonationProject
```

> **Note:** The source files declare `package donationproject;`, so place them under a `donationproject/` folder (or compile from the parent directory) for the package to resolve correctly. If you run into a package error, either keep the folder name as `donationproject` or remove the package line from each file.

---

## 🖥️ How to Use

When you launch the app, you'll see the main menu:

```
.......life in Donation........
-------------------------------------------------
choose an action:
> 1- Donor
> 2- Those in need
> 3- Exit
-------------------------------------------------
```

1. Enter **1** if you want to donate, **2** if you're looking for a device, or **3** to exit.
2. Follow the on-screen prompts for the action you chose.
3. The app loops back to the main menu until you choose **Exit**.

---

## 🛠️ Built With
- **Java** — core language
- **java.io** — file reading and writing for persistence
- **java.util.Scanner** — console input

---

## 💡 Possible Improvements
- Implement the **"Search for a product"** option (currently a menu placeholder).
- Add **National ID validation** (the `\d{10}` check is sketched but commented out).
- Rename the device storage file from `arwa.txt` to something clearer like `devices.txt`.
- Replace text-file storage with a small database for reliability.
- Add a graphical or web interface on top of the existing logic.

---

## 👩‍💻 Author
**Jana**

---

*Built to make giving and receiving medical devices a little easier. 💙*
