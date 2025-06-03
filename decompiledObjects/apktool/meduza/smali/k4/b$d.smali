.class public final Lk4/b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:[Lk4/k;

.field public b:Lv3/i0;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [Lk4/k;

    iput-object p1, p0, Lk4/b$d;->a:[Lk4/k;

    const/4 p1, 0x0

    iput p1, p0, Lk4/b$d;->d:I

    return-void
.end method
