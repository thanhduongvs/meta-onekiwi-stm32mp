require tf-a-stm32mp-common_${PV}.inc
require tf-a-stm32mp-common.inc

SUMMARY = "Trusted Firmware-A SSP for STM32MP1"
LICENSE = "BSD-3-Clause"

PROVIDES += "virtual/trusted-firmware-a-ssp"

TFA_SHARED_SOURCES = "0"

SRC_URI = "git://github.com/thanhduongvs/arm-trusted-firmware-stm32mp.git;protocol=https;name=tfa;branch=v${TF_VERSION}-stm32mp-ssp"
SRCREV = "6d85390e5c644ac3d3d65ae0b09a364d8d62990e"

PV = "${TF_VERSION}-stm32mp-ssp+github+${SRCPV}"

S = "${WORKDIR}/git"

TF_A_BASENAME = "tf-a-ssp"
TF_A_CONFIG = "ssp"
TF_A_CONFIG_ssp = " STM32MP_SSP=1 "

# Configure stm32mp1 make settings
EXTRA_OEMAKE += 'PLAT=stm32mp1'
EXTRA_OEMAKE += 'ARCH=aarch32'
EXTRA_OEMAKE += 'ARM_ARCH_MAJOR=7'
EXTRA_OEMAKE += 'STM32MP_UART_PROGRAMMER=1'
EXTRA_OEMAKE += 'STM32MP_USB_PROGRAMMER=1'

# ---------------------------------
# Configure archiver use
# ---------------------------------
include ${@oe.utils.ifelse(d.getVar('ST_ARCHIVER_ENABLE') == '1', 'tf-a-stm32mp-ssp-archiver.inc','')}
