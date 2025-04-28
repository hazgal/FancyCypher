#!/bin/bash

intro="/path/to/the/file/intro.mp3"
musicloop="//path/to/file/loop.mp3"
mpv "$intro" > /dev/null 2>&1 &
intro_pid=$!

clear
java Main | lolcat &
java_pid=$!

wait $intro_pid
nohup mpv --loop "$musicloop" > /dev/null 2>&1 &

wait $java_pid

pkill -f "mpv"
