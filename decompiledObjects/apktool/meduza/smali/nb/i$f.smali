.class public final Lnb/i$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/i$f$a;,
        Lnb/i$f$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Long;

.field public final c:Ljava/lang/Long;

.field public final d:Ljava/lang/Integer;

.field public final e:Lnb/i$f$b;

.field public final f:Lnb/i$f$a;

.field public final g:Lgb/g3$b;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Lnb/i$f$b;Lnb/i$f$a;Lgb/g3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/i$f;->a:Ljava/lang/Long;

    iput-object p2, p0, Lnb/i$f;->b:Ljava/lang/Long;

    iput-object p3, p0, Lnb/i$f;->c:Ljava/lang/Long;

    iput-object p4, p0, Lnb/i$f;->d:Ljava/lang/Integer;

    iput-object p5, p0, Lnb/i$f;->e:Lnb/i$f$b;

    iput-object p6, p0, Lnb/i$f;->f:Lnb/i$f$a;

    iput-object p7, p0, Lnb/i$f;->g:Lgb/g3$b;

    return-void
.end method
