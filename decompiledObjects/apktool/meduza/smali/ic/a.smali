.class public Lic/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Character;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:C

.field public final b:C

.field public final c:I


# direct methods
.method public constructor <init>(CC)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, Lic/a;->a:C

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lva/a;->e(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, Lic/a;->b:C

    iput v0, p0, Lic/a;->c:I

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    new-instance v0, Lic/b;

    iget-char v1, p0, Lic/a;->a:C

    iget-char v2, p0, Lic/a;->b:C

    iget v3, p0, Lic/a;->c:I

    invoke-direct {v0, v1, v2, v3}, Lic/b;-><init>(CCI)V

    return-object v0
.end method
