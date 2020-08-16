SUMMARY = "OPTEE TA development kit for stm32mp"
LICENSE = "BSD-2-Clause & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c1f21c4f72f372ef38a5a4aee55ec173"

SRC_URI = "git://github.com/thanhduongvs/optee_os-stm32mp.git;protocol=https;name=opteeos;branch=${OPTEE_VERSION}-stm32mp"
SRCREV = "9a5e10b4d2a6e360c3beeca82481779ccbca5249"

OPTEE_VERSION = "3.9.0"
SRCREV_FORMAT = "opteeos"
PV = "${OPTEE_VERSION}+github+${SRCPV}"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(stm32mpcommon)"

OPTEEMACHINE ?= "stm32mp1"
OPTEEMACHINE_stm32mp1common = "stm32mp1"

OPTEEOUTPUTMACHINE ?= "stm32mp1"
OPTEEOUTPUTMACHINE_stm32mp1common = "stm32mp1"


# The package is empty but must be generated to avoid apt-get installation issue
ALLOW_EMPTY_${PN} = "1"

require optee-os-stm32mp-common.inc

# ---------------------------------
# Configure archiver use
# ---------------------------------
include ${@oe.utils.ifelse(d.getVar('ST_ARCHIVER_ENABLE') == '1', 'optee-os-stm32mp-archiver.inc','')}

