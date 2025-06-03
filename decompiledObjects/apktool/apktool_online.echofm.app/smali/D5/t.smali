.class public LD5/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/t$a;,
        LD5/t$b;,
        LD5/t$c;
    }
.end annotation


# static fields
.field public static final b:LD5/t$a;


# instance fields
.field public final a:LE5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD5/t$a;

    .line 2
    .line 3
    invoke-direct {v0}, LD5/t$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD5/t;->b:LD5/t$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lw5/a;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE5/a;

    .line 5
    .line 6
    const-string v1, "flutter/settings"

    .line 7
    .line 8
    sget-object v2, LE5/f;->a:LE5/f;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1, v2}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LD5/t;->a:LE5/a;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a()LD5/t$a;
    .locals 1

    .line 1
    sget-object v0, LD5/t;->b:LD5/t$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b(I)Landroid/util/DisplayMetrics;
    .locals 1

    .line 1
    sget-object v0, LD5/t;->b:LD5/t$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LD5/t$a;->c(I)LD5/t$a$b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p0}, LD5/t$a$b;->a(LD5/t$a$b;)Landroid/util/DisplayMetrics;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    return-object p0
.end method

.method public static c()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    return v0
.end method


# virtual methods
.method public d()LD5/t$b;
    .locals 2

    .line 1
    new-instance v0, LD5/t$b;

    .line 2
    .line 3
    iget-object v1, p0, LD5/t;->a:LE5/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LD5/t$b;-><init>(LE5/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
