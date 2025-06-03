.class public LD5/t$a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static c:I = -0x80000000


# instance fields
.field public final a:I

.field public final b:Landroid/util/DisplayMetrics;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/util/DisplayMetrics;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, LD5/t$a$b;->c:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x1

    .line 7
    .line 8
    sput v1, LD5/t$a$b;->c:I

    .line 9
    .line 10
    iput v0, p0, LD5/t$a$b;->a:I

    .line 11
    .line 12
    iput-object p1, p0, LD5/t$a$b;->b:Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(LD5/t$a$b;)Landroid/util/DisplayMetrics;
    .locals 0

    .line 1
    iget-object p0, p0, LD5/t$a$b;->b:Landroid/util/DisplayMetrics;

    .line 2
    .line 3
    return-object p0
.end method
