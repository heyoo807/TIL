import cv2
import numpy as np

img1 = np.empty((240, 320), dtype = np.uint8)
#numpy.empty() : 임의의 값으로 초기화된 배열을 생성
img2 = np.zeros((240, 320, 3), dtype = np.uint8)
#numpy.zeros() : 0으로 초기화된 배열을 생성
img3 = np.ones((240, 320), dtype = np.uint8)
#numpy.ones() : 1로 초기화된 배열을 생성
img4 = np.full((240, 320, 3), (123, 77, 231), dtype = np.uint8)
#numpy.full() : 원하는 값으로 초기화된 배열을 생성

cv2.imshow('img1', img1)
cv2.imshow('img2', img2)
cv2.imshow('img3', img3)
cv2.imshow('img4', img4)
cv2.waitKey()
cv2.destroyAllWindows()