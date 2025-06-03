.class public Lm5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/a;


# instance fields
.field public a:LE5/k;

.field public b:Lm5/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lm5/f;)Lm5/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lm5/f;->b:Lm5/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public onAttachedToEngine(LA5/a$b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LA5/a$b;->a()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LA5/a$b;->b()LE5/c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lm5/g;

    .line 10
    .line 11
    invoke-direct {v2, v0, v1}, Lm5/g;-><init>(Landroid/content/Context;LE5/c;)V

    .line 12
    .line 13
    .line 14
    iput-object v2, p0, Lm5/f;->b:Lm5/g;

    .line 15
    .line 16
    new-instance v0, LE5/k;

    .line 17
    .line 18
    const-string v2, "com.ryanheise.just_audio.methods"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, LE5/k;-><init>(LE5/c;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lm5/f;->a:LE5/k;

    .line 24
    .line 25
    iget-object v1, p0, Lm5/f;->b:Lm5/g;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, LE5/k;->e(LE5/k$c;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, LA5/a$b;->c()Lio/flutter/embedding/engine/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Lm5/f$a;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lm5/f$a;-><init>(Lm5/f;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lio/flutter/embedding/engine/a;->e(Lio/flutter/embedding/engine/a$b;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public onDetachedFromEngine(LA5/a$b;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lm5/f;->b:Lm5/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Lm5/g;->a()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lm5/f;->b:Lm5/g;

    .line 8
    .line 9
    iget-object v0, p0, Lm5/f;->a:LE5/k;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LE5/k;->e(LE5/k$c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
