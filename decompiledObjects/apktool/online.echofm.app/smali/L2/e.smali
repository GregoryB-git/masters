.class public abstract LL2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL2/b;

.field public static volatile b:LL2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LL2/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LL2/d;-><init>(LL2/c;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LL2/e;->a:LL2/b;

    .line 8
    .line 9
    sput-object v0, LL2/e;->b:LL2/b;

    .line 10
    .line 11
    return-void
.end method

.method public static a()LL2/b;
    .locals 1

    .line 1
    sget-object v0, LL2/e;->b:LL2/b;

    .line 2
    .line 3
    return-object v0
.end method
