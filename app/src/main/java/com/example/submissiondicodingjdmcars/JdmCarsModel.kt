package com.example.submissiondicodingjdmcars

data class JdmCarsModel(
    var image: Int = 0,
    var carName: String = "",
    var carBrand: String = "",
    var carDesc: String = "",
    var driveWheelSystemType: DriveWheelSystemType = DriveWheelSystemType.FWD,
    var carMachine: String = ""
)

enum class DriveWheelSystemType {
    RWD, FWD, FRWD, AWD
}