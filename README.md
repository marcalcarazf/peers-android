# peers-android
[Peers](https://github.com/ymartineau/peers/) SIP softphone project ported to Android.

This project works in most Android devices because it doesn't use *android.sip* libraries. *Javax sound* libraries have been replaced by *android.media* libraries.

## Prerequisites
* [Android Studio](https://developer.android.com/studio) - IDE used in this project. You can pick .java and .jar files and use them in any other IDE.

## Installing - Setup
1. Clone repository:
```
git clone https://github.com/marcalcarazf/peers-android.git
```
2. Open Android Studio.
3. Click on *Open an existing Android Studio project* and select the project folder.

## Util Information 
This project includes all [Peers](https://github.com/ymartineau/peers/) functionalities but doesn't have a GUI implemented.

In *CustomConfig.java* you have to setup User Agent information.

In *EventManager.java* you have main calling actions and SIP listeners implemented. By default it registers the User Agent when running this class, but you can change it in the class constructor.

## Contributing
If you want to contribute to this project, please contact me using this email: *marc.alcarazf@gmail.com*

## Authors
* **Marc Alcaraz** - *Android ported version* - [marcalcarazf](https://github.com/marcalcarazf/)
* **Yohann Martineau** - *[Peers](https://github.com/ymartineau/peers/) project* - [ymartineau](https://github.com/ymartineau/)

## License
This project is licensed under the GNU License - see the [LICENSE.md](LICENSE.md) file for details.
