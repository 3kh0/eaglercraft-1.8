#!/bin/sh
/home/deck/.local/jdk/jdk-17.0.11/bin/java -cp "buildtools/BuildTools.jar" net.lax1dude.eaglercraft.v1_8.buildtools.gui.CompileLatestClientGUI
rm -rf "##TEAVM.TMP##"
