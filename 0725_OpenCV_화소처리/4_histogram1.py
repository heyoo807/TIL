import cv2
import sys
import matplotlib.pyplot as plt

src = cv2.imread('lenna.bmp')

dst1 = src[:,:,0]
dst2 = src[:,:,1]
dst3 = src[:,:,2]
# 컬러 영상에 대한 히스토그램
if src is None:
    print("영상을 읽어올 수 없습니다")
    sys.exit()
hist = cv2.calcHist([src], [0], None , [256], [0, 256])

cv2.imshow('src', src)
cv2.waitKey(1)



plt.plot(hist)
plt.show()