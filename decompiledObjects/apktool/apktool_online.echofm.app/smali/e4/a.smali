.class public abstract Le4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le4/a$c;,
        Le4/a$a;,
        Le4/a$b;
    }
.end annotation


# direct methods
.method public static a(B)Le4/a$b;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Le4/a$a;

    .line 5
    .line 6
    invoke-direct {p0}, Le4/a$a;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance p0, Le4/a$c;

    .line 11
    .line 12
    invoke-direct {p0}, Le4/a$c;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method
