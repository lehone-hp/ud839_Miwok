package com.example.android.miwok.model;


/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private Integer mImageResourceID;

    private Integer mAudioResourceID;


    public Word(String defaultTranslation, String miwokTranslation, Integer imageResaourceID, Integer audioResourceID) {
        this(defaultTranslation, miwokTranslation, audioResourceID);
        mImageResourceID = imageResaourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, Integer audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the resource ID of the image for the corresponding word
     */
    public Integer getImageResourceID() {
        return mImageResourceID;
    }

    public Integer getAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasImage() {
        return getImageResourceID() != null;
    }
}