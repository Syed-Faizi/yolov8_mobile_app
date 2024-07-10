package com.surendramaran.yolov8tflite

object Constants {
//    const val MODEL_CNIC_PATH = "Both_CNIC_Detection_Model_v4.tflite"
//    const val LABELS_CNIC_PATH = "Both_CNIC_Detection_Labels.txt"

//    const val PreTrained_Model = "model.tflite"
//    const val PreTrained_Label = "labels.txt"

    const val MODEL_PARCEL_PATH = "parcel_30_5_24(2Class)_best_float16.tflite"
    const val LABELS_PARCEL_PATH = "parcel_labels.txt"

    const val MODEL_DogPoop_PATH = "dog_poop_2_7_24_best_float16.tflite"
    const val LABELS_DogPoop_PATH = "dog_poop_labels.txt"

    const val MODEL_DROWNING_PATH = "drowning_detection_2class_24_6_24_best_float16.tflite"
    const val LABELS_DROWNING_PATH = "drowning_labels.txt"

    const val MODEL_FIRE_PATH = "fire_2_7_24_best_float16.tflite"
    const val LABELS_FIRE_PATH = "fire_labels.txt"

    const val MODEL_GESTURE_PATH = "gesture_(3class)_20_6_24_best_float16.tflite"
    const val LABELS_GESTURE_PATH = "gesture_labels.txt"

    const val MODEL_PetBaby_PATH = "pet_baby4class_26_6_24_best_float16.tflite"
    const val LABELS_PetBaby_PATH = "parcel_labels.txt"

    const val MODEL_WEAPON_PATH = "weapon_6class_separated_26_6_24_toy_best_float16.tflite"
    const val LABELS_WEAPON_PATH = "weapon_labels.txt"

    const val MODEL_WINDOW_PATH = "Window_5class_3_7_24_best_float16.tflite"
    const val LABELS_WINDOW_PATH = "window_labels.txt"

//    const val MODEL_FALL_JUMP_PATH = "fall_jump_combined_25_6_24_best_float16.tflite"
//    const val LABELS_FALL_JUMP_PATH = "fall_jump_combined_labels.txt"


    val modelList = listOf(
//        ModelList("CNIC",MODEL_CNIC_PATH, LABELS_CNIC_PATH),
        ModelList("Parcel",MODEL_PARCEL_PATH, LABELS_PARCEL_PATH),
//        ModelList("PreTrained",PreTrained_Model, PreTrained_Label),
        ModelList("DogPoop", MODEL_DogPoop_PATH, LABELS_DogPoop_PATH),
        ModelList("Fire", MODEL_FIRE_PATH, LABELS_FIRE_PATH),
        ModelList("Drowning", MODEL_DROWNING_PATH, LABELS_DROWNING_PATH),
        ModelList("Gesture", MODEL_GESTURE_PATH, LABELS_GESTURE_PATH),
        ModelList("PetBaby", MODEL_PetBaby_PATH, LABELS_PetBaby_PATH),
        ModelList("Weapon", MODEL_WEAPON_PATH, LABELS_WEAPON_PATH),
        ModelList("Window", MODEL_WINDOW_PATH, LABELS_WINDOW_PATH),
//        ModelList("Fall_Jump", MODEL_FALL_JUMP_PATH, LABELS_FALL_JUMP_PATH)
    )
}