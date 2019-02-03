package com.example.root.sipdemo;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaRecorder;
import android.util.Log;

import net.sourceforge.peers.media.AbstractSoundManager;

public class AndroidSoundManager extends AbstractSoundManager {

	AudioRecord recorder;
	AudioTrack player;
	private int sampleRate = 8000;
	private int channelConfig = AudioFormat.CHANNEL_IN_MONO;
	private int audioFormat = AudioFormat.ENCODING_PCM_16BIT;
	int minBufSize;


	@Override
	public void init() {

		// Initialize recorder
		minBufSize = AudioRecord.getMinBufferSize(sampleRate, channelConfig, audioFormat);
		recorder = new AudioRecord(MediaRecorder.AudioSource.MIC,sampleRate,channelConfig,audioFormat,minBufSize);
		recorder.startRecording();

		// Initialize player
		player = new AudioTrack(AudioManager.STREAM_MUSIC, sampleRate, AudioFormat.CHANNEL_CONFIGURATION_MONO, AudioFormat.ENCODING_PCM_16BIT,	minBufSize, AudioTrack.MODE_STREAM);
		player.setPlaybackRate(sampleRate);
		player.play();
	}

	@Override
	public void close() {

		// Stop recorder
		recorder.stop();
		recorder.release();

		// Stop player
		player.stop();
		player.release();
	}

	@Override
	public byte[] readData() {

		byte[] buffer = new byte[minBufSize];
		minBufSize = recorder.read(buffer, 0, buffer.length);
		return buffer;
	}

	@Override
	public int writeData(byte[] buffer, int offset, int length) {

		int minBufSizeWriten = player.write(buffer, offset, buffer.length);
		return minBufSizeWriten;
	}

}
