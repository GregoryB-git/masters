.class public final Lr0/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr0/f$c;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iput-wide p2, p0, Lr0/f$c;->b:J

    .line 7
    .line 8
    iput p4, p0, Lr0/f$c;->c:I

    .line 9
    .line 10
    return-void
.end method
