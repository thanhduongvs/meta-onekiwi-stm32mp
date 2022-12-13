FILESEXTRAPATHS_prepend_stm32mpcommon := "${THISDIR}/tf-a-stm32mp:"

SECTION = "bootloaders"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://license.rst;md5=1dd070c98a281d18d9eefd938729b031"

SRC_URI = "git://github.com/thanhduongvs/arm-trusted-firmware-stm32mp.git;protocol=https;name=tfa;branch=v${TF_VERSION}-stm32mp"
SRCREV = "8c4c943fa8ff1e155a569940442e8a6d6854694e"

SRCREV_FORMAT = "tfa"
TF_VERSION = "2.2"
PV = "${TF_VERSION}+github+${SRCPV}"

S = "${WORKDIR}/git"
