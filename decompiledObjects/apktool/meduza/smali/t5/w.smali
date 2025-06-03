.class public final Lt5/w;
.super Lt5/x;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted"

    const/16 v1, 0x7d7

    invoke-direct {p0, v0, p1, v1}, Lt5/x;-><init>(Ljava/lang/String;Ljava/io/IOException;I)V

    return-void
.end method
