.class public final Lx0/e$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Lx0/e$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/e$d;

    invoke-direct {v0}, Lx0/e$d;-><init>()V

    sput-object v0, Lx0/e$d;->a:Lx0/e$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/animation/AnimatorSet;)J
    .locals 2

    const-string v0, "animatorSet"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, La0/d;->b(Landroid/animation/AnimatorSet;)J

    move-result-wide v0

    return-wide v0
.end method
