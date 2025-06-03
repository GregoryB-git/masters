.class public LA6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;
.implements LE5/k$c;


# instance fields
.field public a:LE5/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(LA5/a$b;)V
    .locals 2

    .line 1
    new-instance v0, LE5/k;

    .line 2
    .line 3
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "flutter_native_splash"

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LA6/a;->a:LE5/k;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, LE5/k;->e(LE5/k$c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, LA6/a;->a:LE5/k;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 1

    .line 1
    iget-object p1, p1, LE5/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "getPlatformVersion"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v0, "Android "

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
.end method
