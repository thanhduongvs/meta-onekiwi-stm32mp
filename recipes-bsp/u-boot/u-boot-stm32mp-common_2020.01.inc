# Adaptation from u-boot-common_${PV}.inc

HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
SECTION = "bootloaders"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

DEPENDS += "dtc-native bc-native"
DEPENDS += "flex-native bison-native"

COMPATIBLE_MACHINE = "(stm32mpcommon)"

SRC_URI = "git://github.com/thanhduongvs/uboot-stm32mp.git;name=uboot;protocol=https;branch=v${U_BOOT_VERSION}-stm32mp"
SRCREV = "73657e389d5139d551c3fb1537c04474e4499215"

U_BOOT_VERSION = "2020.01"
SRCREV_FORMAT = "uboot"
PV = "${U_BOOT_VERSION}+github+${SRCPV}"

S = "${WORKDIR}/git"
