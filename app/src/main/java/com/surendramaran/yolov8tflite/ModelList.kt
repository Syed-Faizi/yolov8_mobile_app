package com.surendramaran.yolov8tflite

data class ModelList(
    val name: String ?= "",
    val model: String ?= "",
    val label: String ?= ""
)