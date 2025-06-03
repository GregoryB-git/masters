.class public abstract LN2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN2/e;

.field public static volatile b:LN2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN2/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN2/g;-><init>(LN2/f;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LN2/h;->a:LN2/e;

    .line 8
    .line 9
    sput-object v0, LN2/h;->b:LN2/e;

    .line 10
    .line 11
    return-void
.end method

.method public static a()LN2/e;
    .locals 1

    .line 1
    sget-object v0, LN2/h;->b:LN2/e;

    .line 2
    .line 3
    return-object v0
.end method
