import cv2
import sys


cap = cv2.VideoCapture(0)

if not cap.isOpened():
    print("카메라를 열 수 없습니다")
    sys.exit()
print("가로 사이즈 : ", int(cap.get(cv2.CAP_PROP_FRAME_WIDTH))) # 640
print("세로 사이즈 : ", int(cap.get(cv2.CAP_PROP_FRAME_HEIGHT))) # 480

while True:
    ret, frame = cap.read()
    if not ret: # not False -> True
        break
    inversed = ~frame # 반전
    cv2.imshow('frame', frame)
    cv2.imshow("inversed", inversed)

    if cv2.waitKey(10) == 27: # ESC키
        break
cap.release() # 카메라 끄기
cap.destroyAllWindows()
