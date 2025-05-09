![image](https://github.com/user-attachments/assets/bca8f01d-8e30-4153-a785-c68c5d9efc00)

Makes this school project feel like your sailing the high seas in the late 90's and cracking software on your old intel i386 pc like there no tomorrow.

__Guide for Gnu/Linux users:__

1. The bash script uses _mpv_ media player to run the music files in the background and _lolcat_ for color output. Those two are available thru almost any GNU/Linux distro package managers.
2. In order for the epic music to work, You must change filepaths in the bash script (for example: /home/_your-username_/FancyCypher/intro.mp3 )
3. Make the .sh file executable by opening the terminal, navigating to the FancyCypher folder and run _chmod +x FancyCypher.sh_
4. Next step, while in the terminal, is to build the _Main.java_ with _javac Main.java_ and then running _./Fancycypher.sh_

__Guide for other OS users__

Install GNU/Linux, don't allow yourself in the hands of Corporate overlords!
But some tips that still might help
  
__Options for Mac users:__
    
1. Running GNU/Linux Virtual Machine and following the steps described above.
2. Installing _mpv_ and _lolcat_ thru Homebrew by running _brew install mpv lolcat openjdk_
3. Change filepaths for .mp3 files and running the script.

According to ChatGPT, this slightly reconfigured script might work better under MacOS:
 ```
#!/usr/local/bin/bash

# Make sure here the filepaths are correct!!
intro="/Users/*your-username*/FancyCypher/intro.mp3"
musicloop="/Users/*your-username*/FancyCypher/loop.mp3"

mpv "$intro" > /dev/null 2>&1 &
intro_pid=$!

clear
java Main | lolcat &
java_pid=$!

wait $intro_pid
nohup mpv --loop "$musicloop" > /dev/null 2>&1 &

wait $java_pid

pkill -f "mpv"
```
__Options for Windows users__

Good luck!
