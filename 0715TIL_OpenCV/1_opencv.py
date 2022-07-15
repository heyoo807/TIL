import cv2

import sys

print('현재 opencv 버전 : ', cv2.__version__) # 4.6.0

img = cv2.imread('cat.bmp')

if img is None:
    print("이미지를 불러올 수 없습니다")
    sys.exit() # 프로그램 종료

cv2.namedWindow('image') # 새 창의 이름을 image라고 설정
cv2.imshow('image', img) # image창에 img영상을 출력
cv2.waitKey() # 키보드 입력을 받을 때까지 대기
cv2.destroyAllWindows() # 모든 창을 닫음


