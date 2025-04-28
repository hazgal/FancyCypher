#!/bin/bash

intro="/home/hazgal/koodjohvi/sprint16/sprint16.1/intro.mp3"
musicloop="/home/hazgal/koodjohvi/sprint16/sprint16.1/loop.mp3"
mpv "$intro" > /dev/null 2>&1 &
intro_pid=$!

clear
java Main | lolcat &
java_pid=$!

wait $intro_pid
nohup mpv --loop "$musicloop" > /dev/null 2>&1 &

wait $java_pid

pkill -f "mpv"
