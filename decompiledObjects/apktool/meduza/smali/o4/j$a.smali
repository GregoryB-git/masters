.class public final Lo4/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lo4/l;

.field public final b:Landroid/media/MediaFormat;

.field public final c:Lv3/i0;

.field public final d:Landroid/view/Surface;

.field public final e:Landroid/media/MediaCrypto;


# direct methods
.method public constructor <init>(Lo4/l;Landroid/media/MediaFormat;Lv3/i0;Landroid/view/Surface;Landroid/media/MediaCrypto;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/j$a;->a:Lo4/l;

    iput-object p2, p0, Lo4/j$a;->b:Landroid/media/MediaFormat;

    iput-object p3, p0, Lo4/j$a;->c:Lv3/i0;

    iput-object p4, p0, Lo4/j$a;->d:Landroid/view/Surface;

    iput-object p5, p0, Lo4/j$a;->e:Landroid/media/MediaCrypto;

    return-void
.end method
