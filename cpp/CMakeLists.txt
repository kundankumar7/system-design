cmake_minimum_required(VERSION 3.10)
project(cpp)

set(CMAKE_CXX_STANDARD 17)

include_directories(include)

file(GLOB_RECURSE SOURCES CONFIGURE_DEPENDS src/*.cpp)

add_executable(cpp ${SOURCES})
