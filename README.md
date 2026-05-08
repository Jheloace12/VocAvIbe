# VocAvIbe — AI-Powered Speech Recognition via Haptic Feedback

**Platform:** Android (Java/Kotlin) | **Scope:** Working Prototype (Proof of Concept)

## 📱 About VocAvIbe
VocAvIbe is an innovative Android app designed to help individuals with hearing difficulties practice speech through **haptic feedback**. By converting recognized phonemes into unique vibration patterns, users can feel the difference between speech sounds, making pronunciation practice more intuitive and accessible.

## 🎯 Core Features

### 1. 🎙️ AI Phoneme / Speech Recognition
- Real-time voice capture via microphone using Android AudioRecord API
- MFCC (Mel-Frequency Cepstral Coefficients) audio feature extraction
- Pre-trained TensorFlow Lite model for phoneme classification
- Prototype focus: 5-8 phoneme set (/a/, /e/, /m/, /n/, /v/, /s/, /b/, /p/)

### 2. 📳 Real-Time Haptic Feedback via LRA
- Android VibrationEffect API for custom waveform patterns
- Phoneme-to-vibration mapping table
- Latency <100ms for real-time responsiveness
- Voiced vs. unvoiced sound differentiation

### 3. 📊 Visual Progress Dashboard
- Session summary with accuracy scores
- Streak tracker for motivation
- Per-phoneme accuracy visualization
- Session history (last 5 sessions)

### 4. 👤 User Login & Profile
- Firebase Authentication for secure login
- User profile with hearing difficulty level
- Personalized experience

### 5. 📶 Offline Mode
- On-device TensorFlow Lite model
- Room Database for local data storage
- Full functionality without internet

## 🧰 Tech Stack

| Layer | Technology |
|---|---|
| Language | Java / Kotlin |
| AI / ML | TensorFlow Lite + TarsosDSP |
| Audio Capture | Android AudioRecord API |
| Haptics | Android VibrationEffect API |
| Local Storage | Room Database (Android Jetpack) |
| Authentication | Firebase Authentication |
| Charts | MPAndroidChart |
| IDE | Android Studio |

## 📁 Project Structure

```
VocAvIbe/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/vocavibe/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── auth/
│   │   │   │   │   ├── practice/
│   │   │   │   │   ├── dashboard/
│   │   │   │   │   └── profile/
│   │   │   │   ├── data/
│   │   │   │   │   ├── dao/
│   │   │   │   │   ├── entity/
│   │   │   │   │   └── db/
│   │   │   │   ├── ml/
│   │   │   │   │   ├── audio/
│   │   │   │   │   ├── phoneme/
│   │   │   │   │   └── tflite/
│   │   │   │   ├── haptics/
│   │   │   │   ├── utils/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   ├── assets/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

## 🗂️ App Screens (Prototype)

| Screen | Purpose |
|---|---|
| Splash / Onboarding | Brief intro (3 slides max) |
| Login / Register | Firebase Auth |
| Home Dashboard | Quick stats + Start Practice button |
| Practice Screen | Live mic input + haptic feedback + waveform |
| Results Screen | Post-session accuracy summary |
| Progress Dashboard | Charts + session history |
| Profile Screen | User info + settings |

## 📌 Build Priority

1. ✅ Audio capture + basic phoneme detection (core loop)
2. ✅ Haptic feedback triggered by phoneme (proof of concept)
3. ✅ Login & profile (user identity)
4. ✅ Session saving + offline storage (Room DB)
5. ✅ Progress dashboard (visual layer)
6. ✅ Polish: onboarding, UI design, accessibility labels

## 🚀 Getting Started

### Prerequisites
- Android Studio (latest version)
- Android SDK 26+
- Firebase project configured
- TensorFlow Lite model (pre-trained)

### Setup
1. Clone the repository
```bash
git clone https://github.com/Jheloace12/VocAvIbe.git
cd VocAvIbe
```

2. Open in Android Studio and sync Gradle

3. Configure Firebase:
   - Download `google-services.json` from Firebase Console
   - Place in `app/` directory

4. Add TensorFlow Model:
   - Place `phoneme_model.tflite` in `app/src/main/assets/`

5. Build and run:
```bash
./gradlew build
./gradlew installDebug
```

## 📄 License

MIT License - See LICENSE file for details

## 👥 Team

Developed for users with hearing difficulties, especially in underserved communities.
