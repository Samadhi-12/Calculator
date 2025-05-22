# Responsive Calculator Android App

A simple and responsive calculator app built for Android using Kotlin.  
It supports basic arithmetic operations, parentheses, decimals, and provides a clean user interface that adapts well to different screen sizes.

---

## Features

- Responsive UI with evenly spaced buttons  
- Supports addition, subtraction, multiplication, division  
- Parentheses for grouping expressions  
- Decimal numbers support  
- Clear (C), backspace (arrow), and equals functionality  
- Real-time input and output display  
- Uses [exp4j](https://www.objecthunter.net/exp4j/) library for expression evaluation

---
## Getting Started

### Prerequisites

- Android Studio Bumblebee or newer  
- Minimum SDK version: 21  
- Kotlin support enabled

### Installation

1. Clone this repository:  
   ```bash
   git clone (https://github.com/Samadhi-12/Calculator)

2.Open the project in Android Studio.
3.Build and run the app on your emulator or physical device.

Dependencies
1. This app uses the exp4j library for evaluating mathematical expressions.
Add the following dependency to your app-level build.gradle file:
implementation ("net.objecthunter:exp4j:0.4.8")

2. Lottie for animations (using version catalog alias):
   implementation(libs.lottie)
  
Usage
Tap buttons to input numbers and operations.
Use the C button to clear the input.
Use the arrow button to delete the last character.
Press = to calculate and display the result.

Contact
Created by [Samadhi] - feel free to reach out!
LinkedIn: [[linkedin-profile-url](https://www.linkedin.com/in/samadhi-gunasena-29493a35a/)]

