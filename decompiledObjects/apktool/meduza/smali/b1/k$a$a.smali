.class public final Lb1/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lb1/k$b;)Lb1/k$a;
    .locals 1

    const-string v0, "state"

    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    sget-object p0, Lb1/k$a;->ON_PAUSE:Lb1/k$a;

    goto :goto_0

    :cond_1
    sget-object p0, Lb1/k$a;->ON_STOP:Lb1/k$a;

    goto :goto_0

    :cond_2
    sget-object p0, Lb1/k$a;->ON_DESTROY:Lb1/k$a;

    :goto_0
    return-object p0
.end method

.method public static b(Lb1/k$b;)Lb1/k$a;
    .locals 1

    const-string v0, "state"

    invoke-static {p0, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    sget-object p0, Lb1/k$a;->ON_RESUME:Lb1/k$a;

    goto :goto_0

    :cond_1
    sget-object p0, Lb1/k$a;->ON_START:Lb1/k$a;

    goto :goto_0

    :cond_2
    sget-object p0, Lb1/k$a;->ON_CREATE:Lb1/k$a;

    :goto_0
    return-object p0
.end method
