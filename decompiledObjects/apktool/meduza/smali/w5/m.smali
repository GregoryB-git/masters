.class public final synthetic Lw5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw5/n$a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lw5/n$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/m;->a:Lw5/n$a;

    iput-object p2, p0, Lw5/m;->b:Ljava/lang/String;

    iput-wide p3, p0, Lw5/m;->c:J

    iput-wide p5, p0, Lw5/m;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lw5/m;->a:Lw5/n$a;

    iget-object v6, p0, Lw5/m;->b:Ljava/lang/String;

    iget-wide v2, p0, Lw5/m;->c:J

    iget-wide v4, p0, Lw5/m;->d:J

    iget-object v1, v0, Lw5/n$a;->b:Lw5/n;

    sget v0, Lv5/e0;->a:I

    invoke-interface/range {v1 .. v6}, Lw5/n;->y(JJLjava/lang/String;)V

    return-void
.end method
