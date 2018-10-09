package com.example.experimentone;

import android.content.DialogInterface;
//import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    int choseId = R.id.Pictures;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
        radioClick();
    }


    private void radioClick(){
        RadioGroup Rgroup = (RadioGroup) findViewById(R.id.rb0);
       /* RadioButton pictureButton = (RadioButton) findViewById(R.id.Pictures);
        RadioButton videoButton = (RadioButton) findViewById(R.id.Videos);
        RadioButton questionButton = (RadioButton) findViewById(R.id.Questions);
        RadioButton newsButton = (RadioButton) findViewById(R.id.News);*/
        Rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                choseId = checkedId;
                if (checkedId == R.id.Pictures){
                    Toast.makeText(getApplication(), "图片被选中", Toast.LENGTH_SHORT).show();
                }
                else if (checkedId == R.id.Videos){
                    Toast.makeText(getApplication(), "视频被选中", Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.Questions){
                    Toast.makeText(getApplication(), "问答被选中", Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.News){
                    Toast.makeText(getApplication(), "资讯被选中", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void buttonClick(){
        Button button = (Button) findViewById(R.id.Button1);
        final EditText searchContent = (EditText) findViewById(R.id.Input1);
        AlertDialog.Builder AlertPictureSuccess = new AlertDialog.Builder(this);
        AlertPictureSuccess.setTitle("提示");
        AlertPictureSuccess.setMessage("图片搜索成功");
        AlertPictureSuccess.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框确定按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        AlertPictureSuccess.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框取消按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        final AlertDialog dialogPicture = AlertPictureSuccess.create();

        AlertDialog.Builder AlertVideoSuccess = new AlertDialog.Builder(this);
        AlertVideoSuccess.setTitle("提示");
        AlertVideoSuccess.setMessage("视频搜索成功");
        AlertVideoSuccess.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框确定按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        AlertVideoSuccess.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框取消按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        final AlertDialog dialogVideo = AlertVideoSuccess.create();

        AlertDialog.Builder AlertQuestionSuccess = new AlertDialog.Builder(this);
        AlertQuestionSuccess.setTitle("提示");
        AlertQuestionSuccess.setMessage("问答搜索成功");
        AlertQuestionSuccess.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框确定按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        AlertQuestionSuccess.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框取消按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        final AlertDialog dialogQuestion = AlertQuestionSuccess.create();

        AlertDialog.Builder AlertNewsSuccess = new AlertDialog.Builder(this);
        AlertNewsSuccess.setTitle("提示");
        AlertNewsSuccess.setMessage("资讯搜索成功");
        AlertNewsSuccess.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框确定按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        AlertNewsSuccess.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框取消按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        final AlertDialog dialogNews = AlertNewsSuccess.create();

        AlertDialog.Builder AlertFail = new AlertDialog.Builder(this);
        AlertFail.setTitle("提示");
        AlertFail.setMessage("搜索失败");
        AlertFail.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框确定按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        AlertFail.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplication(),"对话框取消按钮被点击",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        final AlertDialog dialogFails = AlertFail.create();

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(TextUtils.isEmpty(searchContent.getText().toString())) {
                    Toast.makeText(MainActivity.this,"搜索内容不能为空",Toast.LENGTH_SHORT).show();
                }
                else if(searchContent.getText().toString().equals("Health")){
                    if(choseId == R.id.Pictures){
                        dialogPicture.show();
                    }
                    else if(choseId == R.id.Videos){
                        dialogVideo.show();
                    }
                    else if(choseId == R.id.Questions){
                        dialogQuestion.show();
                    }
                    else if(choseId == R.id.News){
                        dialogNews.show();
                    }

                }
                else{
                    dialogFails.show();
                }

            }
        });
    }
}


