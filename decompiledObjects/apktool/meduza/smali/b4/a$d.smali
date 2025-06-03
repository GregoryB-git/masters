.class public final Lb4/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/support/v4/media/session/MediaControllerCompat;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/support/v4/media/session/MediaControllerCompat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/a$d;->a:Landroid/support/v4/media/session/MediaControllerCompat;

    const-string p1, ""

    iput-object p1, p0, Lb4/a$d;->b:Ljava/lang/String;

    return-void
.end method
