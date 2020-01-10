# shell-vars-project

## Reasoning

It's relatively common to test an application against a suite of functional tests, however in many cases there is an overhead when preparing the app/device for such tests. To cut down on this, we wanted to launch the application with some initial data but without having to re-build the app or have metro-bundler running.

Other solutions utilising config files were not suitable here, so I looked into a native solution for Android only.

## Solution (Android only)

It was decided to use adb shell to launch the application, which also gives us the ability to pass paramters to the Intent of the target Activity. These can then be read into our JS code through NativeModules.

Some additional changes were required.

## Why this repository?

I've applied our proposal to a new react-native project which was added in the initial commit. All preceeding commits show the changes made to employ the described solution.
