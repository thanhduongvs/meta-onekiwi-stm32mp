FILESEXTRAPATHS_prepend_stm32mpcommon := "${THISDIR}/tf-a-stm32mp:"

SECTION = "bootloaders"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.rst;md5=1dd070c98a281d18d9eefd938729b031"

SRC_URI = "git://github.com/thanhduongvs/arm-trusted-firmware-stm32mp.git;protocol=https;name=tfa;branch=v${TF_VERSION}-stm32mp"
SRCREV = "c0c3461fc29147fa5e497b7b4109bc31020f46c3"

SRCREV_FORMAT = "tfa"
TF_VERSION = "2.2"
PV = "${TF_VERSION}+github+${SRCPV}"

S = "${WORKDIR}/git"
