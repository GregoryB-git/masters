.class public final LV5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LV5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV5/g;

    .line 2
    .line 3
    invoke-direct {v0}, LV5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV5/g;->a:LV5/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()LV5/f;
    .locals 4

    .line 1
    new-instance v0, LV5/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x14

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-direct {v0, v3, v1, v2}, LV5/f;-><init>(III)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
