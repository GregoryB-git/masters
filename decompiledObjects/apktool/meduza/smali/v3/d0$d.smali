.class public final Lv3/d0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lv3/r1;


# direct methods
.method public constructor <init>(Lz4/p$a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv3/d0$d;->a:Ljava/lang/Object;

    iput-object p1, p0, Lv3/d0$d;->b:Lv3/r1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv3/d0$d;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lv3/r1;
    .locals 1

    iget-object v0, p0, Lv3/d0$d;->b:Lv3/r1;

    return-object v0
.end method
