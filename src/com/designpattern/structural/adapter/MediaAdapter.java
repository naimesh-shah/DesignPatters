package com.designpattern.structural.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvanceMediaPlayer advanceMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advanceMusicPlayer = new VlcPLayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advanceMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMusicPlayer.playMp4(fileName);
		}
	}

}
